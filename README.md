# Implementación de un sistema de notificación reactivo

En el dominio de la banca, el sistema de notificación debe manejar eventos de múltiples orígenes (por ejemplo, solicitudes de préstamo, alertas de fraude, notificaciones de pago) y enviar notificaciones a los clientes de manera eficiente y resiliente. El sistema debe ser capaz de procesar un alto volumen de eventos (10 000 eventos/minuto) con una latencia máxima de 500ms y una disponibilidad del 99.9%. Los eventos deben ser idempotentes y el sistema debe ser capaz de recuperarse de fallos temporales en los servicios externos (por ejemplo, timeout del servicio de notificación por más de 2s).

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del sistema de eventos

**Objetivo:** Establecer un sistema capaz de recibir y procesar eventos de múltiples orígenes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar y describir los diferentes orígenes de eventos.
- Definir los criterios de aceptación para la recepción y procesamiento de eventos.

**Entregable:** Un sistema operativo que recibe y persiste eventos de los tres orígenes declarados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la idempotencia en la recepción de eventos.
- Piensa en la escalabilidad del sistema para manejar un alto volumen de eventos.

</details>

### Fase 2: Manejo de errores y resiliencia

**Objetivo:** Implementar mecanismos para manejar errores y asegurar la resiliencia del sistema.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identificar posibles errores y fallos en el sistema.
- Definir estrategias para manejar estos errores y asegurar la resiliencia.

**Entregable:** Un sistema que maneja errores y fallos de manera resiliente, asegurando la entrega de notificaciones.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el timeout del servicio de notificación.
- Piensa en la recuperación de fallos temporales.

</details>

### Fase 3: Optimización y escalabilidad

**Objetivo:** Optimizar el sistema para manejar un alto volumen de eventos y asegurar su escalabilidad.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identificar puntos de optimización en el sistema.
- Definir estrategias para asegurar la escalabilidad del sistema.

**Entregable:** Un sistema optimizado y escalable que puede manejar un alto volumen de eventos con latencia máxima de 500ms.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la paralelización de tareas.
- Piensa en la distribución de carga.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y cómo se aplica en el dominio de la banca?
- **paraQueSirve**: ¿Para qué sirve la programación reactiva en el manejo de eventos y notificaciones?
- **comoSeUsa**: ¿Cómo se usan los operadores de Project Reactor para manejar flujos de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema reactivo y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de un sistema reactivo en términos de resiliencia y escalabilidad?

## Criterios de Evaluacion

- Implementación de un sistema que recibe y procesa eventos de múltiples orígenes.
- Manejo de errores y fallos de manera resiliente.
- Optimización y escalabilidad del sistema para manejar un alto volumen de eventos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
