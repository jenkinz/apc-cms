package controllers;

import java.util.Date;

import models.Testimonial;
import play.data.Form;
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
    Form<Testimonial> testimonialForm = form(Testimonial.class);
    return ok(views.html.createTestimonialForm.render(testimonialForm));
  }

  /**
   * Handle the new testimonial form submission.
   * 
   * @return
   */
  public static Result saveTestimonial() {
    Form<Testimonial> testimonialForm = form(Testimonial.class)
        .bindFromRequest();
    if (testimonialForm.hasErrors()) {
      return badRequest(views.html.createTestimonialForm
          .render(testimonialForm));
    }
    Testimonial testimonial = testimonialForm.get();
    testimonial.dtCreated = new Date();
    testimonial.dtLastModified = testimonial.dtCreated;
    testimonial.save();
    flash("success", "Testimonial " + testimonial.name + " has been created");
    return listTestimonials();
  }

  /**
   * Display the edit form of an existing testimonial.
   * 
   * @param id
   * @return
   */
  public static Result editTestimonial(Long id) {
    Form<Testimonial> testimonialForm = form(Testimonial.class).fill(
        Testimonial.find.byId(id));
    return ok(views.html.editTestimonialForm.render(id, testimonialForm));
  }

  /**
   * Handle the edit testimonial form submission.
   * 
   * @param id
   * @return
   */
  public static Result updateTestimonial(Long id) {
    Form<Testimonial> testimonialForm = form(Testimonial.class)
        .bindFromRequest();
    if (testimonialForm.hasErrors()) {
      return badRequest(views.html.createTestimonialForm
          .render(testimonialForm));
    }
    Testimonial testimonial = testimonialForm.get();
    testimonial.dtLastModified = new Date();
    testimonial.update(id);
    flash("success", "Testimonial " + testimonial.name + " was saved");
    return listTestimonials();
  }

  /**
   * Handle testimonial deletion.
   * 
   * @param id
   * @return
   */
  public static Result deleteTestimonial(Long id) {
    Testimonial.find.byId(id).delete();
    flash("success", "Testimonial was deleted");
    return listTestimonials();
  }
}