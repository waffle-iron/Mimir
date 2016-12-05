package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Kirill Djonua <k.djonua@gmail.com>
 */
public class BookController extends Controller {
    public Result details(long id) {
        return ok(views.html.book.details.render());
    }
}
