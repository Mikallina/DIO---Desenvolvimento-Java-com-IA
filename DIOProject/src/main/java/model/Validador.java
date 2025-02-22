package model;

public class Validador {
    public boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remove caracteres n�o num�ricos

        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os d�gitos s�o iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro d�gito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int remainder = sum % 11;
        int digit1 = (remainder < 2) ? 0 : (11 - remainder);

        // Calcula o segundo d�gito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        remainder = sum % 11;
        int digit2 = (remainder < 2) ? 0 : (11 - remainder);

        // Verifica os d�gitos verificadores
        return (digit1 == Character.getNumericValue(cpf.charAt(9)) &&
                digit2 == Character.getNumericValue(cpf.charAt(10)));
    }

    
    
    public boolean validarTelefone(String telefone) {
        return telefone.matches("\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}"); // Verifica se est� no formato (XX) XXXX-XXXX ou (XX) XXXXX-XXXX
    }
}
