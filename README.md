# 🐾 Petshop Service Management - UFPB

Sistema de gestão de serviços para Petshop (Banho, Tosa e Hotelzinho) desenvolvido em Java. O projeto aplica padrões de **Programação Orientada a Objetos (POO)** para criar um sistema escalável e de fácil manutenção.

## 🎯 Objetivo
Automatizar o registro de atendimentos, cálculo de preços dinâmicos e geração de relatórios de faturamento diário para um Petshop com diferentes modalidades de serviço.

## 🛠️ Arquitetura e Conceitos Aplicados

O design do sistema foi estruturado para demonstrar o domínio dos pilares da POO:

- **Abstração & Herança (`Servico`):** Classe base abstrata que centraliza atributos comuns como código, data e porte do animal, servindo de molde para os serviços específicos.
- **Interfaces (`ServicoPet`):** Contrato que garante a implementação dos métodos `calcularPreco()` e `getDetails()` em todas as categorias de serviço.
- **Polimorfismo:** O inventário utiliza uma `List<ServicoPet>`, permitindo tratar diferentes objetos (Banho, Tosa, Hotel) de forma genérica durante o processamento do relatório final.
- **Enumerações (`TamanhoAnimal`, `TamanhoPelo`):** Tipagem forte para garantir a integridade dos dados e centralizar as constantes de preço, facilitando ajustes futuros na tabela de valores.
- **Encapsulamento:** Atributos protegidos e métodos específicos para garantir que as regras de cálculo fiquem restritas às suas respectivas classes.

## 📋 Regras de Negócio (Preços)

### 🧼 Tabela de Banho
| Porte do Animal | Pelo Curto | Pelo Médio | Pelo Longo |
| :--- | :--- | :--- | :--- |
| **Pequeno** | R$ 50,00 | R$ 65,00 | R$ 75,00 |
| **Médio** | R$ 60,00 | R$ 75,00 | R$ 85,00 |
| **Grande** | R$ 70,00 | R$ 85,00 | R$ 95,00 |

### 🏨 Hotelzinho e ✂️ Tosa
- **Hotel:** Pequeno (**R$ 12/h**), Médio (**R$ 18/h**), Grande (**R$ 25/h**).
- **Tosa:** Pequeno (**R$ 30,00**), Médio (**R$ 40,00**), Grande (**R$ 50,00**).
