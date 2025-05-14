Service Name	Responsibility
event_api_gateway	API Gateway (routes traffic, auth, rate limits)
event_discovery	Eureka service discovery
event_config	Spring Cloud Config for central configuration

event_user	User service: profiles, preferences, login, JWT handling
event_notification	Email/SMS/push notifications (Kafka-based consumers)
event_booking	Ticket booking lifecycle: seat lock, confirm, cancel
event_seat_service	Real-time seat map, availability, locking (Redis-backed)
event_pricing	Dynamic pricing engine (surge pricing based on demand)
event_payment	Payment microservice (mock integration with UPI/cards)
event_audit_log	Kafka consumer storing user & system events (e.g., seat lock, booking)
event_review	Reviews & ratings for events
event_streaming	gRPC/WebSocket streaming service (for seat map & ticket updates)
event_admin	Event/venue manager dashboard: CRUD events, prices, shows
event_chat (optional)	Bidirectional gRPC chat for customer support or live event Q&A
event_queue (optional)	Smart waitlisting + queue management for sold-out events