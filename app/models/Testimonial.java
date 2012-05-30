package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

/**
 * Testimonial entity
 */
@Entity
public class Testimonial extends Model {

  @Id
  public Long id;

  @Constraints.Required
  public String quote;

  @Constraints.Required
  public String name;

  public String location;

  // public Image thumbnail;
  //
  // public Image projectSample;

  public Date dtCreated;

  public Date dtLastModified;

  /**
   * Generic query helper for entity Testimonial with id Long
   */
  public static Finder<Long, Testimonial> find = new Finder<Long, Testimonial>(
      Long.class, Testimonial.class);
}
