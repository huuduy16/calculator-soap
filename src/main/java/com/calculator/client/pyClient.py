import requests

url="http://localhost:8080/ws"

headers = {'content-type': 'text/xml'}

body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="http://www.baeldung.com/springsoap/gen">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:calculatorRequest>
            <gs:expression>
                <gs:num0>2</gs:num0>
                <gs:num1>3</gs:num1>
                <gs:operation>+</gs:operation>
            </gs:expression>
        </gs:calculatorRequest>
    </soapenv:Body>
</soapenv:Envelope>"""

response = requests.post(url,data=body,headers=headers)
print(response.content)