package club.showx.interview.shipment;

public class WebServiceException extends Exception {
    //
    public final static int GENERIC = 2000000;

    //
    public final static int SHIPMENT_NOT_EXIST = 2001001;
    public final static int SHIPMENT_TRADE_NOT_EXIST = 2001011;

    public final static int SHIPMENT_SPLIT_QUANTITY_NOT_EQUALS = 2001101;
    public final static int SHIPMENT_MERGED_NOT_IN_SAME_TRADE = 2001201;
    public final static int SHIPMENT_MERGED_SIZE_LESS_THAN_2 = 2001202;

    //
    private int no;

    //
    public WebServiceException(int no, String message, Exception cause) {
        super(message, cause);

        this.no = no;
    }

    public WebServiceException(Exception cause) {
        super(cause.getMessage(), cause);

        this.no = GENERIC;
    }

    public WebServiceException(int no, String message) {
        super(message);

        this.no = no;
    }

    public int getNo() {
        return no;
    }
}
