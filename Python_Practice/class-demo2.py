class mobile:
    def __init__(self):
        self.model = 'Samsung'
        
    def show_model(self):
        print("Model :" , self.model)
        
realme = mobile() # here we created an object of mobile class

print(realme.show_model) #it print the funtion reference

realme.show_model()

realme.model='Apple' # changing the model vaue

print(realme.show_model)
realme.show_model()