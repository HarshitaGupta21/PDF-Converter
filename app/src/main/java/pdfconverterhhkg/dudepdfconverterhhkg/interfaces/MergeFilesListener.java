package pdfconverterhhkg.dudepdfconverterhhkg.interfaces;

public interface MergeFilesListener {
    void resetValues(boolean isPDFMerged, String path);
    void mergeStarted();
}
