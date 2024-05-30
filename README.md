# scouter-plugin-server-alert-sms
scouter-plugin-server-alert sms <br>

ext_plugin_sms_send_alert=true      <br>
ext_plugin_sms_level=1                  <br>
ext_plugin_sms_group_id=8                   <br>
ext_plugin_sms_debug=false                      <br>
ext_plugin_sms_api_url=http://localhost:8000/api/send-sms-group        <br>
<br>
## 그룹 문자 발송 API 예시      <br>
curl -X POST http://localhost:8000/api/send-sms-group -H 'Content-Type: application/json;charset=UTF-8' -H 'cache-control: no-cache' -d '{"groupID":"1","msg":"안녕하세요."}'            <br>

