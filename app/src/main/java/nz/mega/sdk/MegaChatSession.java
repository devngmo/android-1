/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaChatSession {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaChatSession(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaChatSession obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megachatJNI.delete_MegaChatSession(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaChatSession copy() {
    long cPtr = megachatJNI.MegaChatSession_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaChatSession(cPtr, false);
  }

  public int getStatus() {
    return megachatJNI.MegaChatSession_getStatus(swigCPtr, this);
  }

  public long getPeerid() {
    return megachatJNI.MegaChatSession_getPeerid(swigCPtr, this);
  }

  public long getClientid() {
    return megachatJNI.MegaChatSession_getClientid(swigCPtr, this);
  }

  public boolean hasAudio() {
    return megachatJNI.MegaChatSession_hasAudio(swigCPtr, this);
  }

  public boolean hasVideo() {
    return megachatJNI.MegaChatSession_hasVideo(swigCPtr, this);
  }

  public int getNetworkQuality() {
    return megachatJNI.MegaChatSession_getNetworkQuality(swigCPtr, this);
  }

  public boolean getAudioDetected() {
    return megachatJNI.MegaChatSession_getAudioDetected(swigCPtr, this);
  }

  public MegaChatSession() {
    this(megachatJNI.new_MegaChatSession(), true);
  }

  public final static int SESSION_STATUS_INVALID = 0xFF;
  public final static int SESSION_STATUS_INITIAL = 0;
  public final static int SESSION_STATUS_IN_PROGRESS = SESSION_STATUS_INITIAL + 1;
  public final static int SESSION_STATUS_DESTROYED = SESSION_STATUS_IN_PROGRESS + 1;

}
