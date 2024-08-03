package Lógica.MovimientoEntidades;

import Lógica.Entidades.Posición;
import Lógica.Interfaces.Movimiento;

public class MovimientoDerecha implements Movimiento {
  @Override
  public void mover(Posición posiciónActual, int velocidad) {
    posiciónActual.establecerPosiciónX(posiciónActual.obtenerPosiciónX() + velocidad);
  }
}
