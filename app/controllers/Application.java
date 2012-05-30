package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }

  /**
   * Display all testimonials.
   */
  public static Result listTestimonials() {
    return TODO;
  }

  /**
   * Display the new testimonial form.
   * 
   * @return
   */
  public static Result createTestimonial() {
    return TODO;
  }

  /**
   * Handle the new testimonial form submission.
   * 
   * @return
   */
  public static Result saveTestimonial() {
    return TODO;
  }

  /**
   * Display the edit form of an existing testimonial.
   * 
   * @param id
   * @return
   */
  public static Result editTestimonial(Long id) {
    return TODO;
  }

  /**
   * Handle the edit testimonial form submission.
   * 
   * @param id
   * @return
   */
  public static Result updateTestimonial(Long id) {
    return TODO;
  }

  /**
   * Handle testimonial deletion.
   * 
   * @param id
   * @return
   */
  public static Result deleteTestimonial(Long id) {
    return TODO;
  }
}