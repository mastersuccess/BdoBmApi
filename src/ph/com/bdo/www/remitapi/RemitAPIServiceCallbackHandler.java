/**
 * RemitAPIServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package ph.com.bdo.www.remitapi;


/**
 *  RemitAPIServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class RemitAPIServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public RemitAPIServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public RemitAPIServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for doorToDoorMaxs method
     * override this method for handling normal response from doorToDoorMaxs operation
     */
    public void receiveResultdoorToDoorMaxs(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorMaxs operation
     */
    public void receiveErrordoorToDoorMaxs(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doorToDoorSMGiftPadala method
     * override this method for handling normal response from doorToDoorSMGiftPadala operation
     */
    public void receiveResultdoorToDoorSMGiftPadala(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorSMGiftPadala operation
     */
    public void receiveErrordoorToDoorSMGiftPadala(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bDOAKBeneficiary method
     * override this method for handling normal response from bDOAKBeneficiary operation
     */
    public void receiveResultbDOAKBeneficiary(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bDOAKBeneficiary operation
     */
    public void receiveErrorbDOAKBeneficiary(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pickUpMLLhuillier method
     * override this method for handling normal response from pickUpMLLhuillier operation
     */
    public void receiveResultpickUpMLLhuillier(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pickUpMLLhuillier operation
     */
    public void receiveErrorpickUpMLLhuillier(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doorToDoorRushDelivery method
     * override this method for handling normal response from doorToDoorRushDelivery operation
     */
    public void receiveResultdoorToDoorRushDelivery(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorRushDelivery operation
     */
    public void receiveErrordoorToDoorRushDelivery(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for creditOtherBank method
     * override this method for handling normal response from creditOtherBank operation
     */
    public void receiveResultcreditOtherBank(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from creditOtherBank operation
     */
    public void receiveErrorcreditOtherBank(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doorToDoorCash method
     * override this method for handling normal response from doorToDoorCash operation
     */
    public void receiveResultdoorToDoorCash(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorCash operation
     */
    public void receiveErrordoorToDoorCash(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkService method
     * override this method for handling normal response from checkService operation
     */
    public void receiveResultcheckService(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.CheckServiceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkService operation
     */
    public void receiveErrorcheckService(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bDOAKRemitter method
     * override this method for handling normal response from bDOAKRemitter operation
     */
    public void receiveResultbDOAKRemitter(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bDOAKRemitter operation
     */
    public void receiveErrorbDOAKRemitter(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pickUpCebuana method
     * override this method for handling normal response from pickUpCebuana operation
     */
    public void receiveResultpickUpCebuana(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pickUpCebuana operation
     */
    public void receiveErrorpickUpCebuana(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for creditCASAOnLine method
     * override this method for handling normal response from creditCASAOnLine operation
     */
    public void receiveResultcreditCASAOnLine(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from creditCASAOnLine operation
     */
    public void receiveErrorcreditCASAOnLine(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doorToDoorCashCard method
     * override this method for handling normal response from doorToDoorCashCard operation
     */
    public void receiveResultdoorToDoorCashCard(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorCashCard operation
     */
    public void receiveErrordoorToDoorCashCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doorToDoorJolibee method
     * override this method for handling normal response from doorToDoorJolibee operation
     */
    public void receiveResultdoorToDoorJolibee(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorJolibee operation
     */
    public void receiveErrordoorToDoorJolibee(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for pickUpCash method
     * override this method for handling normal response from pickUpCash operation
     */
    public void receiveResultpickUpCash(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from pickUpCash operation
     */
    public void receiveErrorpickUpCash(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for doorToDoorSMAppliance method
     * override this method for handling normal response from doorToDoorSMAppliance operation
     */
    public void receiveResultdoorToDoorSMAppliance(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from doorToDoorSMAppliance operation
     */
    public void receiveErrordoorToDoorSMAppliance(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkStatus method
     * override this method for handling normal response from checkStatus operation
     */
    public void receiveResultcheckStatus(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiStatusResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkStatus operation
     */
    public void receiveErrorcheckStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cashCardReload method
     * override this method for handling normal response from cashCardReload operation
     */
    public void receiveResultcashCardReload(
        ph.com.bdo.www.remitapi.RemitAPIServiceStub.ApiResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cashCardReload operation
     */
    public void receiveErrorcashCardReload(java.lang.Exception e) {
    }
}
