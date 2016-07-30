package com.blog.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the article_category database table.
 * 
 */
@Entity
@Table(name="article_category")
@NamedQuery(name="ArticleCategory.findAll", query="SELECT a FROM ArticleCategory a")
public class ArticleCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="article_category_id")
	private Integer articleCategoryId;

	@Column(name="article_category_name")
	private String articleCategoryName;

	private String remark;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public ArticleCategory() {
	}

	public Integer getArticleCategoryId() {
		return this.articleCategoryId;
	}

	public void setArticleCategoryId(Integer articleCategoryId) {
		this.articleCategoryId = articleCategoryId;
	}

	public String getArticleCategoryName() {
		return this.articleCategoryName;
	}

	public void setArticleCategoryName(String articleCategoryName) {
		this.articleCategoryName = articleCategoryName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}