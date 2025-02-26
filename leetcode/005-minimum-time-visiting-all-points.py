def minTimeToVisitAllPoints(points):
    total_time = 0  
    
    for i in range(len(points) - 1):
        x1, y1 = points[i]      
        x2, y2 = points[i + 1]  
        
        time_needed = max(abs(x2 - x1), abs(y2 - y1))
        total_time += time_needed  
    
    return total_time 

print(minTimeToVisitAllPoints([[1,1], [3,4], [-1,0]]))  
print(minTimeToVisitAllPoints([[3,2], [-2,2]]))        
