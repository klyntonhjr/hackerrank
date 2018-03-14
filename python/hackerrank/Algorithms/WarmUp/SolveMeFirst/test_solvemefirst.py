import unittest
from solvemefirst import *

class TestSolveMeFirst(unittest.TestCase):
    def test_solveMeFirst(self):
        x = 3
        y = 2 
        self.assertEqual(solveMeFirst(x,y), x+y)
    def test_neg(self):
        x = 3
        y = -4
        self.assertEqual(solveMeFirst(x,y), x+y)

if __name__ == '__main__':
    unittest.main()
