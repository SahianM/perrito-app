package cl.desafiolatam.perritoapp.api;

public class Response {

    public ResponseState state;
    public boolean hasError;
    //public RequestType requestType;TODO Corregir
    //public IndicadorEconomico result;TODO Corregir
    public String errorMessage;

    public enum ResponseState {
        SUCCESS,
        FAILURE,
        NO_CONNECTION
    }
    /*public enum RequestType {
        SEARCH_FOR_RAZA
    }*/
    //TODO Corregir
}
