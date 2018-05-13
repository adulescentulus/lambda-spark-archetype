#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

public class ResponseObject
{

    private Status status;

    public Status getStatus()
    {
        return status;
    }

    public ResponseObject setStatus(final Status status)
    {
        this.status = status;
        return this;
    }

    public enum Status {
        OK, ERROR, UNAUTHORIZED, BAD_REQUEST, URL_INVALID
    }

}