package me.huding.luobo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTimeline<M extends BaseTimeline<M>> extends Model<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}

	public java.lang.String getId() {
		return get("id");
	}

	public void setCreatedDate(java.util.Date createdDate) {
		set("createdDate", createdDate);
	}

	public java.util.Date getCreatedDate() {
		return get("createdDate");
	}

	public void setDisplayName(java.lang.String displayName) {
		set("displayName", displayName);
	}

	public java.lang.String getDisplayName() {
		return get("displayName");
	}

	public void setDisplayDate(java.util.Date displayDate) {
		set("displayDate", displayDate);
	}

	public java.util.Date getDisplayDate() {
		return get("displayDate");
	}

}
