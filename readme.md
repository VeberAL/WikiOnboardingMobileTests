<h3><p align="center">В данном проекте тестируется мобильное приложение Википедии в трех средах:</p></h3>

- Сервис с удаленными устройствами Browserstack;
  <h6>Запуск при помощи команды: ./gradlew clean test -DdeviceHost=browserstack</h6>
- Эмулятор android studio;
  <h6>Запуск при помощи команды: ./gradlew clean test -DdeviceHost=emulation</h6>
- Реальное подключенное устройство.</h4>
  <h6>Запуск при помощи команды: ./gradlew clean test -DdeviceHost=real</h6>

<p align="center">Видео с запуском теста при помощи Browserstack:</p>
<p align="center">
<img title="Browserstack Video" src="materials/brwstck.gif" width="350" height="350"  alt="video">   
</p>
