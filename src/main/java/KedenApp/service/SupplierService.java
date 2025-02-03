package KedenApp.service;

import KedenApp.postgresql.entity.Supplier;
import KedenApp.postgresql.repository.SupplierRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Transactional
    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }

    @Transactional
    public Supplier getSupplierById(Long id) {
        if (id == null) {
            return new Supplier();
        }
        return supplierRepository.findById(id).orElse(new Supplier());
    }

    @Transactional
    public void saveSupplier(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Transactional
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
