class mobile:
    
    def __init__(self, m):
        self.brand = m
        
    def show_model(self,p):
        price = p
        print("Model :", self.brand , "and price :", price)
        
realme = mobile('Apple') # passing aurgument to constructor

realme.show_model(25000) # value for p

print(id(realme)) #to print reference id

realme1 = mobile('17 pro max')
realme1.show_model(152000)
print(id(realme1))

realme2 = mobile('16 pro')
realme2.show_model(52000)
print(id(realme2))