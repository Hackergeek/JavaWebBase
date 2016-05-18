package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;

public class UploadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestIp = request.getRemoteAddr();
		String saveDirectory = "d:\\tools\\upload";
		File savedir = new File(saveDirectory);
		if(!savedir.exists()) {
			savedir.mkdirs();
		}
		int maxPostSize = 5 * 1024 * 1024;		//上传大小限制为5M
		FileRenamePolicy policy = new DefaultFileRenamePolicy();
		MultipartRequest multipartRequest;
		multipartRequest = new MultipartRequest(request, saveDirectory, maxPostSize, "UTF-8", policy);
		
		Enumeration<String> files = multipartRequest.getFileNames();
		while(files.hasMoreElements()) {
			String name = files.nextElement();
			//System.out.println(name);
			File f = multipartRequest.getFile(name);
			//System.out.println(f.getName());
			if(f != null) {
				String fileName = f.getName();
				File serverFile = new File(saveDirectory + "\\" + requestIp + "-" + fileName);
				//将先前上传的文件删除，这样才能覆盖先前上传的文件
				if(serverFile.exists()) {
					serverFile.delete();
				}
				f.renameTo(serverFile);
				String message = "文件上传成功！文件名为： " + requestIp + "-" + fileName;
				request.setAttribute("message", message);
			}
		}
		request.getRequestDispatcher("upload.jsp").forward(request, response);
	}

}
