package my.edu.utem.ftmk.dad.restorderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.edu.utem.dad.restorderapp.model.OrderType;
import my.edu.utem.ftmk.dad.restorderapp.repository.OrderTypeRepository;

/**
 * REST controller for managing order types.
 */
@RestController
@RequestMapping("/api/ordertypes")
public class OrderTypeRESTController {

    @Autowired
    private OrderTypeRepository orderTypeRepository;

    @GetMapping
    public List<OrderType> getOrderTypes() {
        return orderTypeRepository.findAll();
    }

    @GetMapping("/api/{orderTypeId}")
    public OrderType getOrderType(@PathVariable Long orderTypeId) {
        return orderTypeRepository.findById(orderTypeId).orElse(null);
    }

    @PostMapping
    public OrderType insertOrderType(@RequestBody OrderType orderType) {
        return orderTypeRepository.save(orderType);
    }

    @PutMapping("/{orderTypeId}")
    public OrderType updateOrderType(@PathVariable Long orderTypeId, @RequestBody OrderType orderType) {
        orderType.setOrderTypeId(orderTypeId);
        return orderTypeRepository.save(orderType);
    }

    @DeleteMapping("/{orderTypeId}")
    public void deleteOrderType(@PathVariable Long orderTypeId) {
        orderTypeRepository.deleteById(orderTypeId);
    }
}
