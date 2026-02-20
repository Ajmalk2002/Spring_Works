class father:
    def __init__(self):
        self.money = 1000
        print("Father class Constructor")
        
    def show(self):
        print("Father class Instance Method")
        
class son(father):
    def dispaly(self):
        print("Son class instance", self.money)
        
s = son()
s.dispaly()
print("Son class Instance Method" , s.money)
s.show()