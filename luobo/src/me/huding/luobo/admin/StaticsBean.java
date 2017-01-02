package me.huding.luobo.admin;

import java.util.Date;
import java.util.HashMap;

import me.huding.luobo.utils.DateStyle;
import me.huding.luobo.utils.DateUtils;

public class StaticsBean extends HashMap<String, String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5211016004030524664L;

	public static final String CONTENT = "content";
	
	public static final String TITLE = "title";
	
	public static final String PUBLISH_TIME  = "publishTime";
	
	public static final String AUTHOR = "author";
	
	public static final String ID = "id";
	
	public void setContent(String content){
		put(CONTENT, content);
	}
	
	public void setID(String value){
		put(ID, value);
	}
	
	public void setTitle(String title){
		put(TITLE, title);
	}
	
	public void setPublishTime(String publishTime){
		put(PUBLISH_TIME, publishTime);
	}
	
	public void setPublishTime(Date publishTime){
		String pt = DateUtils.DateToString(publishTime, DateStyle.YYYY_MM_DD_HH_MM_SS);
		setPublishTime(pt);
	}
	
	public void setAuthor(String author){
		put(AUTHOR, author);
	}
	
	
	public static class Builder {
		private StaticsBean staticsBean = new StaticsBean();
		
		public Builder setContent(String content){
			this.staticsBean.setContent(content);
			return this;
		}
		
		public Builder setTitle(String title){
			this.staticsBean.setTitle(title);
			return this;
		}
		
		public Builder setPublishTime(String publishTime){
			this.staticsBean.setPublishTime(publishTime);
			return this;
		}
		
		public Builder setPublishTime(Date publishTime){
			this.staticsBean.setPublishTime(publishTime);
			return this;
		}
		
		public Builder setAuthor(String author){
			this.staticsBean.setAuthor(author);
			return this;
		}
		
		public Builder setID(String id){
			this.staticsBean.setID(id);
			return this;
		}
		
		public StaticsBean build(){
			return staticsBean;
		}
	}
}