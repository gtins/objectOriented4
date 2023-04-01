public class Veiculo {
    private String Modelo;

    private String Cor;

    private String Placa;

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo veiculo)) return false;

        if (getModelo() != null ? !getModelo().equals(veiculo.getModelo()) : veiculo.getModelo() != null) return false;
        if (getCor() != null ? !getCor().equals(veiculo.getCor()) : veiculo.getCor() != null) return false;
        return getPlaca() != null ? getPlaca().equals(veiculo.getPlaca()) : veiculo.getPlaca() == null;
    }
    @Override
    public int hashCode() {
        int result = getModelo() != null ? getModelo().hashCode() : 0;
        result = 31 * result + (getCor() != null ? getCor().hashCode() : 0);
        result = 31 * result + (getPlaca() != null ? getPlaca().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Modelo='" + Modelo + '\'' +
                ", Cor='" + Cor + '\'' +
                ", Placa='" + Placa + '\'' +
                '}';
    }
}
