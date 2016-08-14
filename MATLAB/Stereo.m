fileName='C:\Matlab\Recording\Amma.wav';
[y, fs,]=wavread(fileName);	% Read wave file 
left=y(:,1);			% Left channel 
subplot(2,1,1), plot((1:length(left))/fs, left);
wavwrite(left, fs, 'C:\Matlab\Wave File 02\left.wav');
