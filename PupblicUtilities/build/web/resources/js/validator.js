function loginvalidation() {
  const usernameInput = document.getElementById('username');
  const passwordInput = document.getElementById('password');

  if (usernameInput.value.length < 4) {

    document.getElementById('usernameError').innerHTML = 'Логин должен содержать не менее 4 символов.';
    event.preventDefault();

    return false;
  }

  // Проверка длины и простоты пароля
  if (passwordInput.value.length < 6 || passwordInput.value === 'password' || passwordInput.value === '123456') {
    document.getElementById('passwordError').innerHTML = 'Пароль должен быть не менее 6 символов';
    event.preventDefault();
    return false;
  }
  if (!passwordInput.value.match(/[0-9]/) || !passwordInput.value.match(/[a-z]/)) {
    document.getElementById('passwordError').innerHTML = 'Пароль не должен быть простым.';
    event.preventDefault();
    return false;
  }


  // Проверка логина и пароля на наличие пробелов
  if (usernameInput.value.indexOf(' ') !== -1) {
    document.getElementById('usernameError').innerHTML = 'Логин не должен содержать пробелы.';
    event.preventDefault();
    return false;
  }

  if (passwordInput.value.indexOf(' ') !== -1) {
    document.getElementById('passwordError').innerHTML = 'Пароль не должен содержать пробелы.';
    event.preventDefault();
    return false;
  }

  return true;

}