package pdfconverterhhkg.dudepdfconverterhhkg.interfaces;

public interface EmptyStateChangeListener {
    void setEmptyStateVisible();
    void setEmptyStateInvisible();
    void showNoPermissionsView();
    void hideNoPermissionsView();
    void filesPopulated();
}
