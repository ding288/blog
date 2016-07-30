package com.blog.action;

import java.io.File;

public class ImgUploadAction {
	// 上传的文件对象
	private File photo;
	// 文件名称

	public String upload() {
		return "";
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}
	
}
