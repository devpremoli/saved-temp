# Launch instance in Public 1A
aws ec2 run-instances --image-id ami-08970251d20e940b0 --instance-type t2.micro --security-group-ids sg-0ce30486fa2c092fc --subnet-id subnet-0150a66c44919f553 --key-name learning --user-data file://user-data-subnet-id.txt


# Launch instance in Public 1B
aws ec2 run-instances --image-id ami-08970251d20e940b0 --instance-type t2.micro --security-group-ids sg-0ce30486fa2c092fc --subnet-id subnet-034a5705d0a3827f4 --key-name learning --user-data file://user-data-subnet-id.txt

# Launch instance in Private 1B
aws ec2 run-instances --image-id ami-08970251d20e940b0 --instance-type t2.micro --security-group-ids sg-0ce30486fa2c092fc --subnet-id subnet-07b4d4bd4266a0636 --key-name learning --user-data file://user-data-subnet-id.txt

# Terminate instances

aws ec2 terminate-instances --instance-ids <value> <value>