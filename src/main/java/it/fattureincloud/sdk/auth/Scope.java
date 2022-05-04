package it.fattureincloud.sdk.auth;

public enum Scope {
    SITUATION("situation:r"),
    ENTITY_CLIENTS_READ("entity.clients:r"),
    ENTITY_CLIENTS_ALL("entity.clients:a"),
    ENTITY_SUPPLIERS_READ("entity.suppliers:r"),
    ENTITY_SUPPLIERS_ALL("entity.suppliers:a"),
    PRODUCTS_READ("products:r"),
    PRODUCTS_ALL("products:a"),
    ISSUED_DOCUMENTS_INVOICES_READ("issued_documents.invoices:r"),
    ISSUED_DOCUMENTS_CREDITNOTES_READ("issued_documents.credit_notes:r"),
    ISSUED_DOCUMENTS_RECEIPTS_READ("issued_documents.receipts:r"),
    ISSUED_DOCUMENTS_ORDERS_READ("issued_documents.orders:r"),
    ISSUED_DOCUMENTS_QUOTES_READ("issued_documents.quotes:r"),
    ISSUED_DOCUMENTS_PROFORMAS_READ("issued_documents.proformas:r"),
    ISSUED_DOCUMENTS_DELIVERYNOTES_READ("issued_documents.delivery_notes:r"),
    ISSUED_DOCUMENTS_INVOICES_ALL("issued_documents.invoices:a"),
    ISSUED_DOCUMENTS_CREDITNOTES_ALL("issued_documents.credit_notes:a"),
    ISSUED_DOCUMENTS_RECEIPTS_ALL("issued_documents.receipts:a"),
    ISSUED_DOCUMENTS_ORDERS_ALL("issued_documents.orders:a"),
    ISSUED_DOCUMENTS_QUOTES_ALL("issued_documents.quotes:a"),
    ISSUED_DOCUMENTS_PROFORMAS_ALL("issued_documents.proformas:a"),
    ISSUED_DOCUMENTS_DELIVERYNOTES_ALL("issued_documents.delivery_notes:a"),
    RECEIVED_DOCUMENTS_READ("received_documents:r"),
    RECEIVED_DOCUMENTS_ALL("received_documents:a"),
    STOCK_READ("stock:r"),
    STOCK_ALL("stock:a"),
    RECEIPTS_READ("receipts:r"),
    RECEIPTS_ALL("receipts:a"),
    TAXES_READ("taxes:r"),
    TAXES_ALL("taxes:a"),
    ARCHIVE_READ("archive:r"),
    ARCHIVE_ALL("archive:a"),
    CASHBOOK_READ("cashbook:r"),
    CASHBOOK_ALL("cashbook:a"),
    SETTINGS_READ("settings:r"),
    SETTINGS_ALL("settings:a");

    private String scope;

    Scope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }
}
