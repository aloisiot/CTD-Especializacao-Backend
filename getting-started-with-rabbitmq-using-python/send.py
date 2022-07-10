#!/usr/bin/env python
import pika

connection = pika.BlockingConnection(
    pika.ConnectionParameters('localhost')
)
channel = connection.channel()
print('[x] Channel created')
channel.queue_declare(queue='hello')
channel.basic_publish(exchange = "", routing_key='hello', body='Hello World!')
print('[x] "Hello World!" sent')
connection.close()
print('[x] Connection closed')
