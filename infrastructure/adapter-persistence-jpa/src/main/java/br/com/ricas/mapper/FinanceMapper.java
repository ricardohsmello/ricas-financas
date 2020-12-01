package br.com.ricas.mapper;

import br.com.ricas.entity.FinanceEntity;
import br.com.ricas.model.Finance;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class FinanceMapper {

    public FinanceEntity toFinanceEntity(final Finance finance) {
        return FinanceEntity.builder()
                .UUID(finance.getUUID())
                .description(finance.getDescription())
                .dateTime(finance.getDateTime())
                .category(CategoryMapper.toCategoryEntity(finance.getCategory()))
                .value(finance.getValue())
                .build();
    }

    public Finance toFinance(final FinanceEntity financeEntity) {
        return Finance.builder()
                .UUID(financeEntity.getUUID())
                .description(financeEntity.getDescription())
                .dateTime(financeEntity.getDateTime())
                .category(CategoryMapper.toCategory(financeEntity.getCategory()))
                .value(financeEntity.getValue())
                .build();
    }

    public List<Finance> toListFinance(final List<FinanceEntity> list) {
        List<Finance> listFinance = new ArrayList<>();

        list.forEach(financeEntity -> {
            listFinance.add(toFinance(financeEntity));
        });

        return listFinance;
    }
}
