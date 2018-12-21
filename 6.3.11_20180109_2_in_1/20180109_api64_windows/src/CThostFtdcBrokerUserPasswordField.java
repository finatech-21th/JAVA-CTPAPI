/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcBrokerUserPasswordField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerUserPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcBrokerUserPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_Password_get(swigCPtr, this);
  }

  public void setLastUpdateTime(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_set(swigCPtr, this, value);
  }

  public String getLastUpdateTime() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_LastUpdateTime_get(swigCPtr, this);
  }

  public void setLastLoginTime(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_set(swigCPtr, this, value);
  }

  public String getLastLoginTime() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_LastLoginTime_get(swigCPtr, this);
  }

  public void setExpireDate(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_ExpireDate_set(swigCPtr, this, value);
  }

  public String getExpireDate() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_ExpireDate_get(swigCPtr, this);
  }

  public void setWeakExpireDate(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_set(swigCPtr, this, value);
  }

  public String getWeakExpireDate() {
    return thosttraderapiJNI.CThostFtdcBrokerUserPasswordField_WeakExpireDate_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserPasswordField() {
    this(thosttraderapiJNI.new_CThostFtdcBrokerUserPasswordField(), true);
  }

}