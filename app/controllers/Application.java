package controllers;

import models.Testimonial;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

  public static Result index() {
    return redirect(routes.Application.listTestimonials());
  }

  /**
   * Display all testimonials.
   */
  public static Result listTestimonials() {
    return ok(views.html.listTestimonials.render(Testimonial.find.all()));
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