package com.W3Dev.w3devcalling;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

class SimpleSdpObserver implements SdpObserver {

    @Override
    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    @Override
    public void onSetSuccess() {
    }

    @Override
    public void onCreateFailure(String s) {
    }

    @Override
    public void onSetFailure(String s) {
    }

}
