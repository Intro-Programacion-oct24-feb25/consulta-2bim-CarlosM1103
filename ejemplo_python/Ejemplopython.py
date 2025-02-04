# Función recursiva para calcular el factorial
def factorial(n):
    if n == 0 or n == 1:
        return 1  # Caso base
    else:
        return n * factorial(n - 1)  # Llamada recursiva

# Número para calcular el factorial
numero = 5
# Llamada a la función recursiva
resultado = factorial(numero)
# Mostrar el resultado
print("El factorial de", numero, "es:", resultado)