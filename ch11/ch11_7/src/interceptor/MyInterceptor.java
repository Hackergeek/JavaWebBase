package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
	
	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		//获取页面提交的所有属性及其属性值
		Map<String, Object> parameters = ai.getInvocationContext().getParameters();
		//对每对属性、属性值分别进行过滤，将过滤后的内容再保存到该属性中
		for(String key : parameters.keySet()) {
			Object value = parameters.get(key);
			if(value != null && value instanceof String[]) {
				String[] valueArray = (String[]) value;
				for(int i = 0; i < valueArray.length; i++) {
					if(valueArray[i] != null) {
						//判断用户提交的评论内容是否有要过滤的内容
						if(valueArray[i].contains("讨厌")) {
							//以“喜欢”代替要过滤的内容“讨厌”
							valueArray[i] = valueArray[i].replaceAll("讨厌", "喜欢");
							//把替代后的评论内容设置为Action的评论内容
							parameters.put(key, valueArray);
						}
					}
				}
			}
		}
		return ai.invoke();
	}

}
