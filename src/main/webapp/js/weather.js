const init = () => {
    let weatherForm = document.querySelector("form");
    const getWeather = (e) => {
        let result = document.getElementById("#result");
        let enteredZip = document.getElementById("#zipcode");
        if (enteredZip.value.length === 0) {
            result.innerHTML = "<span class=\"text-danger\">Please input a zipcode</span>";
        } else if (enteredZip.value.length > 5) {
            result.innerHTML = "<span class=\"text-danger\">Please input a zipcode with 5 digits</span>";
        } else {
            result.innerHTML = ""; // clears previous result
        }
    };
    weatherForm.addEventListener("submit", getWeather);
}
window.onload = init();