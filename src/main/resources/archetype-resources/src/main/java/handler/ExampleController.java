#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.handler;

import static spark.Spark.before;
import static spark.Spark.get;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import ${package}.model.ResponseObject;
import spark.Request;
import spark.Response;

public class ExampleController
{
    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    public ExampleController()
    {
        LOG.debug("constructor");
        Gson gson = new Gson();
        get("/example", ExampleController::handleRequest, gson::toJson);
    }

    public static ResponseObject handleRequest(Request request, Response response)
    {
        return new ResponseObject().setStatus(ResponseObject.Status.OK);
    }

}
