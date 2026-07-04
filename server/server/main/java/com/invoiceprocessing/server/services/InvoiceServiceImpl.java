package com.invoiceprocessing.server.services;

import com.invoiceprocessing.server.dao.InvoiceDao;
import com.invoiceprocessing.server.model.Invoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    private static final Logger logger = LoggerFactory.getLogger(InvoiceServiceImpl.class);

    @Autowired
    InvoiceDao invoiceDao;

    @Override
    @Transactional
    public Invoice addInvoice(Invoice invoice) {
        // assign the returned entity (it contains generated id and managed state)
        Invoice saved = invoiceDao.save(invoice);
        logger.info("Saved invoice with id={}", saved.getId());
        return saved;
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();
    }

    @Override
    @Transactional
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceDao.findById(id).orElse(null);
        if (invoice != null) {
            invoiceDao.delete(invoice);
            logger.info("Deleted invoice with id={}", id);
        } else {
            logger.warn("Invoice with id={} not found for delete", id);
        }
        return invoice;
    }
}