package com.blog.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class ImgUploadAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private File img;
	private HttpServletResponse response;
	private HttpServletRequest request;

	public String upload() {
		String name = new Date().getTime() + "";
		String path = request.getServletContext().getRealPath("upload");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		if (img != null) {
			try {
				name = new Date().getTime() + "";
				path = Thread.currentThread().getContextClassLoader().getResource("").getPath()
						.replace("WEB-INF/classes", "");
				fis = new FileInputStream(img);
				fos = new FileOutputStream(path + "/upload/" + name + ".jpg");
				byte[] b = new byte[655360];
				fis.read(b);
				fos.write(b);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write("upload/" + name + ".jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.flush();
		pw.close();
		return null;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

}
