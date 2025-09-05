# Proyecto QA Automatizado - Appium + Serenity + Screenplay

Este proyecto es una **suite de pruebas automatizadas móviles** para la aplicación **API Demos (Android)**.  
El objetivo es mostrar un ejemplo claro y profesional de cómo implementar pruebas de UI móviles usando **Appium** y el patrón **Screenplay**, soportado por **Serenity BDD** y **Cucumber**.

---

## Tecnologías y Patrón Utilizados

- **Appium** → Framework para la automatización de aplicaciones móviles (Android en este caso).  
- **Serenity BDD** → Framework de automatización que facilita la escritura de pruebas legibles y genera reportes detallados en HTML.  
- **Cucumber** → Permite describir escenarios en **Gherkin**, lenguaje natural entendible por negocio y QA.  
- **Patrón Screenplay** → Patrón de diseño que organiza las pruebas en componentes reutilizables:
  - **Actor** → Representa al usuario que interactúa con la app.  
  - **Tasks (Tareas)** → Acciones que realiza el actor (ejemplo: navegar, hacer scroll, aceptar alertas).  
  - **Questions (Preguntas)** → Validaciones sobre el estado de la aplicación (ejemplo: “¿el checkbox está marcado?”).  
  - **UI Targets** → Localizadores centralizados de elementos.  

Este patrón favorece la **legibilidad**, **reutilización de código** y **mantenibilidad** de las pruebas.

---

## Requisitos Previos

Antes de ejecutar el proyecto, necesitas instalar:

1. **Java 11 o superior**  
2. **Gradle** (wrapper incluido en el proyecto)  
3. **Node.js y Appium Server**  
   ```bash
   npm install -g appium
   appium driver install uiautomator2
   ```
4. **Android SDK** y emulador o dispositivo físico configurado.  
5. **Appium Inspector** (opcional, para inspeccionar elementos de la app).  
6. **Aplicación de prueba** → `API Demos.apk`.

---

## Estructura del Proyecto

- **`/src/test/resources/features/`** → Archivos `.feature` escritos en Gherkin.  
- **`/src/test/java/com/demo/mobile/stepdefinitions/`** → Step Definitions (glue code).  
- **`/src/test/java/com/demo/mobile/tasks/`** → Implementación de Tasks.  
- **`/src/test/java/com/demo/mobile/questions/`** → Implementación de Questions.  
- **`/src/test/java/com/demo/mobile/ui/`** → Localizadores centralizados.  
- **`/src/test/java/com/demo/mobile/runners/`** → Clases Runner para ejecutar las pruebas.  

---

## Ejecución de las Pruebas

Puedes ejecutar las pruebas de diferentes formas:

### 1. Ejecutar todos los features
```bash
./gradlew clean test
```

### 2. Ejecutar por Runner (o feature incluido)
Ejemplo para **alerts.feature**:
```bash
./gradlew clean test --tests com.demo.mobile.runners.AlertsRunner
```

### 3. Ejecutar por Tags
Ejemplo para **smoke tests**:
```bash
./gradlew clean test -Dcucumber.options="--tags @smoke"
```

---

## Reportes de Resultados

Al finalizar la ejecución, Serenity genera un **reporte HTML interactivo** en la siguiente ruta:

```
build/reports/tests/test/index.html
```
El reporte incluye:
- Resultados de escenarios y pasos.
- Evidencia visual (capturas de pantalla).
- Métricas de cobertura de pruebas.
- Gráficas de ejecución para análisis rápido.

---

## Archivos de prueba (APK)

Este proyecto requiere el archivo **ApiDemos-debug.apk** para ejecutar las pruebas automatizadas.

🔒 **Por buenas prácticas, los binarios `.apk` no están versionados en GitHub** (se encuentran excluidos en `.gitignore`). Esto mantiene el repositorio liviano y centrado únicamente en el código fuente.

### Instrucciones para añadir el APK:

1. Descarga el APK de prueba desde el repositorio oficial de Appium:  
   [ApiDemos-debug.apk](https://github.com/appium/appium/blob/master/packages/appium/sample-code/apps/ApiDemos-debug.apk)

2. Colócalo en la ruta de tu proyecto:
   ```
   src/test/resources/apps/ApiDemos-debug.apk
   ```

3. Verifica el archivo `serenity.properties` y ajusta la propiedad `appium.app` si tu ruta local es diferente:
   ```properties
   appium.app=src/test/resources/apps/ApiDemos-debug.apk
   ```
   Ejemplo con ruta absoluta:
   ```properties
   appium.app=/home/usuario/Downloads/ApiDemos-debug.apk
   ```

⚠️ **Nota importante:**  
Si no agregas manualmente el APK en la ruta indicada, las pruebas **no podrán ejecutarse**, ya que Appium necesita desplegar esta aplicación de ejemplo en el emulador o dispositivo.

---

## Conclusión

Este proyecto es un **ejemplo demostrativo** de cómo aplicar **Appium + Serenity + Cucumber** bajo el **patrón Screenplay** para la automatización de pruebas móviles.  
Su estructura modular permite **extender fácilmente los escenarios**, reutilizar código y generar reportes claros que aportan valor tanto al equipo técnico como al negocio.

