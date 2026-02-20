class mobile:
    def __init__( self , m , v=80):
        self.model = m
        self.volume = v
    
    def show_model(self, p):
        price = p
        print("Model ", self.model , "and price ", price)
        print("Volume ", self.volume)
        
realme = mobile('Realme') # it takes default volume (80)

realme.show_model(25600)

print()

readmi  = mobile('Redmi ', 12) # here we give the value
readmi.show_model(12000)