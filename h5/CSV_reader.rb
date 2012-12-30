require 'csv'

i = Dir["*.csv"].length

csv_arr = Dir.glob("*.csv")
Array.new number = Array.new(29){0}
for csv_arr2 in csv_arr
	CSV.foreach(csv_arr2) do |row|
		for num in row
			if (num.to_i > 0)
				number[num.to_i-1] = number[num.to_i-1].to_i + 1
				end
			end
		end
	end

max = number[0]
min = number[0]
print "Students' votes: \n"
for k in 0..i
	print (k+1).to_s + ": " + number[k].to_s + "\n"
	if max < number[k]
		max = number[k]
		number_one = k+1
		end
	if min > number[k]
		min = number[k]
		number_1000 = k+1
	end
end

print "Student numer uno is: #" + number_one.to_s + " with total of " + max.to_s + " votes.\n"
print "Student numer lasto is: #" + number_1000.to_s + " with total of " + min.to_s + " votes.\n"
