package com.blog.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQueries({ @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
		@NamedQuery(name = "User.findUserByUserName", query = "SELECT u FROM User u where u.userName=:userName") })
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;

	private String email;

	private String name;

	private String password;

	@Column(name = "user_name")
	private String userName;

	// bi-directional many-to-one association to Article
	@OneToMany(mappedBy = "user")
	private List<Article> articles;

	// bi-directional many-to-one association to ArticleCategory
	@OneToMany(mappedBy = "user")
	private List<ArticleCategory> articleCategories;

	@OneToOne
	@JoinColumn(name = "person_id")
	private Person person;

	public User() {
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Article addArticle(Article article) {
		getArticles().add(article);
		article.setUser(this);

		return article;
	}

	public Article removeArticle(Article article) {
		getArticles().remove(article);
		article.setUser(null);

		return article;
	}

	public List<ArticleCategory> getArticleCategories() {
		return this.articleCategories;
	}

	public void setArticleCategories(List<ArticleCategory> articleCategories) {
		this.articleCategories = articleCategories;
	}

	public ArticleCategory addArticleCategory(ArticleCategory articleCategory) {
		getArticleCategories().add(articleCategory);
		articleCategory.setUser(this);

		return articleCategory;
	}

	public ArticleCategory removeArticleCategory(ArticleCategory articleCategory) {
		getArticleCategories().remove(articleCategory);
		articleCategory.setUser(null);

		return articleCategory;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}