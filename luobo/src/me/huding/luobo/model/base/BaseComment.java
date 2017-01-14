package me.huding.luobo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseComment<M extends BaseComment<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setNickname(java.lang.String nickname) {
		set("nickname", nickname);
	}

	public java.lang.String getNickname() {
		return get("nickname");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}

	public java.lang.String getContent() {
		return get("content");
	}

	public void setCdate(java.util.Date cdate) {
		set("cdate", cdate);
	}

	public java.util.Date getCdate() {
		return get("cdate");
	}

	public void setUpnum(java.lang.Integer upnum) {
		set("upnum", upnum);
	}

	public java.lang.Integer getUpnum() {
		return get("upnum");
	}

	public void setDownum(java.lang.Integer downum) {
		set("downum", downum);
	}

	public java.lang.Integer getDownum() {
		return get("downum");
	}

	public void setParent(java.lang.String parent) {
		set("parent", parent);
	}

	public java.lang.String getParent() {
		return get("parent");
	}

	public void setBlogID(java.lang.String blogID) {
		set("blogID", blogID);
	}

	public java.lang.String getBlogID() {
		return get("blogID");
	}

}
