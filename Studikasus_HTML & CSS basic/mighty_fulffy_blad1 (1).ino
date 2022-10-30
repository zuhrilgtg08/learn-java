const int trig = 10;
const int echo = 11;
int led = 2;

long durasi;
long jarak;

void setup()
{
  pinMode(trig, OUTPUT);
  pinMode(echo, INPUT);
  pinMode(led, OUTPUT);
  Serial.begin (9600);
}

void loop()
{
  digitalWrite(trig,LOW);
  delayMicroseconds(2);
  digitalWrite(trig,HIGH);
  delayMicroseconds(10);
  digitalWrite(trig,LOW);
  durasi = pulseIn(echo,HIGH);
  jarak = durasi*0.034/2;
  Serial.print ("jarak= ");
  Serial.println (jarak);
  
  if (jarak < 50)
  {
    digitalWrite(led,HIGH);
    delay(500);
    digitalWrite(led,LOW);
    delay(500);
  }else if (jarak >= 50 && jarak <= 150){
  	digitalWrite(led,HIGH);
    delay(200);
    digitalWrite(led,LOW);
    delay(200);
  }else if (jarak > 150){ 
    digitalWrite (led, HIGH);
    delay(100);
    digitalWrite(led,LOW);
    delay(100);
  }
 
}