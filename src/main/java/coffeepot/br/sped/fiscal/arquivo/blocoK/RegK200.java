package coffeepot.br.sped.fiscal.arquivo.blocoK;

import java.time.LocalDate;

import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sped.fiscal.tipos.IndicadorTipoEstoque;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * #%L
 * coffeepot-br-sped-fiscal
 * %%
 * Copyright (C) 2013 - 2024 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

@Record(fields = {
        @Field(name = "reg", id = true, constantValue = "K200"),
        @Field(name = "dtEst"),
        @Field(name = "codItem"),
        @Field(name = "qtd"),
        @Field(name = "indEst"),
        @Field(name = "codPart"),
})
@Getter
@Setter
@NoArgsConstructor
public class RegK200 {

    private LocalDate dtEst;
    private String codItem;
    private Double qtd;
    private IndicadorTipoEstoque indEst;
    private String codPart;
}
