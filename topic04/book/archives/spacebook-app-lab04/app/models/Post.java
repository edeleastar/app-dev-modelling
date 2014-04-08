package models;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Post extends Model
{
  public String title;
  public String content;

  public Post(String title, String content)
  {
    this.title = title;
    this.content = content;
  }

  public String toString()
  {
    return title;
  } 
}